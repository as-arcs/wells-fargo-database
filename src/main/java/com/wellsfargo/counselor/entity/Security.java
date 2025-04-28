package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.FetchType;

@Entity
public class Security {

  @Id
  @GeneratedValue()
  private Long securityId;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "portfolio_id")
  private Portfolio portfolio;

  @Column
  private String name;

  @Column
  private String category;

  @Column
  private long purchasePrice;

  @Column
  private String purchaseDate;

  @Column
  private int quantity;

  public Security() {

  }

  public Security(Portfolio portfolio, String name, String category,
                  long purchasePrice, String purchaseDate, int quantity) {
    this.portfolio = portfolio;
    this.name = name;
    this.category = category;
    this.purchasePrice = purchasePrice;
    this.purchaseDate = purchaseDate;
    this.quantity = quantity;
  }
  public void setSecurityId(Long securityId) {
    this.securityId = securityId;
  }

  public Long getSecurityId() {
    return securityId;
  }

  public Portfolio getPortfolio() {
    return portfolio;
  }

  public void setPortfolio(Portfolio port) {
    this.portfolio = port;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public long getPurchasePrice() {
    return purchasePrice;
  }

  public void setPurchasePrice(long purchasePrice) {
    this.purchasePrice = purchasePrice;
  }

  public String getPurchaseDate() {
    return purchaseDate;
  }

  public void setPurchaseDate(String purchaseDate) {
    this.purchaseDate = purchaseDate;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }
}
