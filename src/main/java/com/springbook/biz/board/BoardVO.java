package com.springbook.biz.board;

import java.util.Date;

public class BoardVO {

	private int bidx;
	private String btitle;
	private int bwriter;
	private String bcontent;
	private Date bdate;
	private int bstat;

	public int getBidx() {
		return bidx;
	}

	public void setBidx(int bidx) {
		this.bidx = bidx;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public int getBwriter() {
		return bwriter;
	}

	public void setBwriter(int bwriter) {
		this.bwriter = bwriter;
	}

	public String getBcontent() {
		return bcontent;
	}

	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	public int getBstat() {
		return bstat;
	}

	public void setBstat(int bstat) {
		this.bstat = bstat;
	}

	@Override
	public String toString() {
		return "BoardVO[bidx=" + bidx + 
				", btitle=" + btitle + 
				", bwriter=" + bwriter +
				", bcontent=" + bcontent + 
				", bdate=" + bdate + 
				", bstat=" + bstat + 				
				"]";
	}

}
