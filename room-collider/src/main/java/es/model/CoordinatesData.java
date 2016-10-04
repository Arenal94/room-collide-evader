package es.model;

import java.util.Date;

public class CoordinatesData {

	private Double dist_izq;
	private Double dist_der;
	private Double dist_front;
	private Double dist_back;
	private Date time;
	
	
	public CoordinatesData( Double dist_izq, Double dist_der, Double dist_front, Double dist_back, Date time) {
		super();
		this.dist_izq = dist_izq;
		this.dist_der = dist_der;
		this.dist_front = dist_front;
		this.dist_back = dist_back;
		this.time = time;
	}



	public Double getDist_izq() {
		return dist_izq;
	}

	public void setDist_izq(Double dist_izq) {
		this.dist_izq = dist_izq;
	}

	public Double getDist_der() {
		return dist_der;
	}

	public void setDist_der(Double dist_der) {
		this.dist_der = dist_der;
	}

	public Double getDist_front() {
		return dist_front;
	}

	public void setDist_front(Double dist_front) {
		this.dist_front = dist_front;
	}

	public Double getDist_back() {
		return dist_back;
	}

	public void setDist_back(Double dist_back) {
		this.dist_back = dist_back;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "CoordinatesData [dist_izq=" + dist_izq + ", dist_der=" + dist_der + ", dist_front="
				+ dist_front + ", dist_back=" + dist_back + ", time=" + time + "]";
	}
	
	
	
	
}
