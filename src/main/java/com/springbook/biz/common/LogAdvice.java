package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

import com.springbook.biz.board.BoardVO;

public class LogAdvice {
	public void printLog(JoinPoint jp) {
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		System.out.println("[공통로그] 호출메서드:" + method + " 매개변수" + args[0].toString());
	}

	public void afterBoardLog(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName();
		String data = null;
		if (returnObj instanceof BoardVO) {
			BoardVO bVo = (BoardVO) returnObj;
			String btitle = bVo.getBtitle();
			if (btitle.equals("")) {
				data = "";
			} else {
				data = btitle;
			}
		} else {
			data = "No Board";
		}
		System.out.println("method: " + method + "제목은 " + data + " obj: " + returnObj.toString());
	}
}
