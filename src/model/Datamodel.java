package model;

public class Datamodel {
	private int id;
	private String linkanh;
	private String tieude;
	private String noidung;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLinkanh() {
		return linkanh;
	}
	public void setLinkanh(String linkanh) {
		this.linkanh = linkanh;
	}
	public String getTieude() {
		return tieude;
	}
	public void setTieude(String tieude) {
		this.tieude = tieude;
	}
	public String getNoidung() {
		return noidung;
	}
	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}
	public Datamodel(int id, String linkanh, String tieude, String noidung) {
		super();
		this.id = id;
		this.linkanh = linkanh;
		this.tieude = tieude;
		this.noidung = noidung;
	}
	
}
