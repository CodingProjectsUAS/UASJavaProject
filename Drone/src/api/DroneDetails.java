package api;

public class DroneDetails {
	public int id;
	public String dronetype;
	public String created;
	public String serialnumber;
	public int carriage_weight;
	public String carriage_type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDronetype() {
		return dronetype;
	}
	public void setDronetype(String dronetype) {
		this.dronetype = dronetype;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public String getSerialnumber() {
		return serialnumber;
	}
	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}
	public int getCarriage_weight() {
		return carriage_weight;
	}
	public void setCarriage_weight(int carriage_weight) {
		this.carriage_weight = carriage_weight;
	}
	public String getCarriage_type() {
		return carriage_type;
	}
	public void setCarriage_type(String carriage_type) {
		this.carriage_type = carriage_type;
	}
}
