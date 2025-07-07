package orders.bean;

public class ShipBean {

	private static final long serialVersionUID = 1L;
       
	//訂單物流
    private int shipId;         //物流編號    
    private String shipName;  //運送方式
    private int shipFee;        //運費
    
  //物流編號
	public int getShipId() {
		return shipId;
	}
	public void setShipId(int shipId) {
		this.shipId = shipId;
	}
	
	
	//運送方式
	public String getShipName() {
		return shipName;
	}
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	
	//運費
	public int getShipFee() {
		return shipFee;
	}
	public void setShipFee(int shipFee) {
		this.shipFee = shipFee;
	}
    

}
