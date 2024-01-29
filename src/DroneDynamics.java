
public class DroneDynamics {
	public int id;
	public String timestamp;
	public String drone;
	public int speed;
	public float align_roll;
	public float align_pitch;
	public float align_yaw;
	public float longitude;
	public float latitude;
	public int battery_status;
	public String last_seen;
	public String Status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getDrone() {
		return drone;
	}
	public void setDrone(String drone) {
		this.drone = drone;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public float getAlignmnet_roll() {
		return align_roll;
	}
	public void setAlignmnet_roll(float align_roll) {
		this.align_roll = align_roll;
	}
	public float getControl_range() {
		return align_pitch;
	}
	public void setControl_range(float control_range) {
		this.align_pitch = control_range;
	}
	public float getAlignment_yaw() {
		return align_yaw;
	}
	public void setAlignment_yaw(float align_yaw) {
		this.align_yaw = align_yaw;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public int getBattery_status() {
		return battery_status;
	}
	public void setBattery_status(int battery_status) {
		this.battery_status = battery_status;
	}
	public String getLast_seen() {
		return last_seen;
	}
	public void setLast_seen(String last_seen) {
		this.last_seen = last_seen;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
}
