package product.bean;

import java.time.LocalDateTime;

import com.google.gson.annotations.SerializedName;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class ProdBeanN implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "PROD_ID")
	private Integer prod_id;
	@Column(name = "PROD_NAME")
	@SerializedName(value = "prod_name", alternate = {"prod-name"})
	private String prod_name;
	@Column(name = "PROD_DESC")
	private String prod_desc;
	@Column(name = "PROD_CATE_ID")
	@SerializedName(value = "prod_cate_id", alternate = {"prod-cate-id"})
	private Integer prod_cate_id;
	@Column(name = "PROD_STATUS")
	@SerializedName(value = "prod_status", alternate = {"prod-status"})
	private Integer prod_status;
	@Column(name = "")
	private LocalDateTime create_at;
	private String image_url;
	
	//get
	public Integer getProd_id() { return prod_id; }
	public String getProd_name() { return prod_name; }
	public String getProd_desc() { return prod_desc; }
	public Integer getProd_cate_id() { return prod_cate_id;}
	public Integer getProd_status() { return prod_status; }
	public LocalDateTime getCreate_at() { return create_at; }
	
	
	public String getImage_url() {
		return image_url;
	}
	
	//set
	public void setProd_id(Integer prod_id) { this.prod_id = prod_id; }
	public void setProd_name(String prod_name) { this.prod_name = prod_name; }
	public void setProd_desc(String prod_desc) { this.prod_desc = prod_desc; }
	public void setProd_cate_id(Integer prod_cate_id) { this.prod_cate_id = prod_cate_id; }
	public void setProd_status(Integer prod_status) { this.prod_status = prod_status; }
	public void setCreate_at(LocalDateTime create_at) {this.create_at = create_at; }
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	
	
	
	
}