package Fenyuk;

public enum Month {
	
	JANUARY(31,Season.WINTER),
	FEBRUARY(28,Season.WINTER),
	MARCH(31,Season.SPRING),
	APRIL(30,Season.SPRING),
	MAY(31,Season.SPRING),
	JUNE(30,Season.SUMMER),
	JULY(31,Season.SUMMER),
	AUGUST(31,Season.SUMMER),
	SEPTEMBER(30,Season.FALL),
	OCTOBER(31,Season.FALL),
	NOVEMBER(30,Season.FALL),
	DECEMBER(31,Season.WINTER);
	
	int Days;
	Season season;

	private Month(int days, Season season) {
		this.Days = days;
		this.season = season;
	}

	public int getDays() {
		return Days;
	}

	public Season getSeason() {
		return season;
	}

	
	

}
