package com.productos.model;


public class Item {

  private Integer id;
  private boolean checked;
  private String description;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public boolean isChecked() {
    return checked;
  }

  public void setChecked(boolean checked) {
    this.checked = checked;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

	@Override
	public String toString() {
		return "Item [id=" + id + ", checked=" + checked + ", description=" + description + "]";
	}
}
