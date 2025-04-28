package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Portfolio {
  @Id
  @GeneratedValue()
  private long portfolioId;

  @ManyToOne
  private Client client;

  @Column(nullable = false)
  private long creationDate;

  protected Portfolio() {

  }
  public void Portfolio(Long portfolioId, Long creationDate) {
    this.portfolioId = portfolioId;
    this.creationDate = creationDate;
  }

  public Long getId() {
    return portfolioId;
  }

  public long getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Long creationDate) {
    this.creationDate = creationDate;
  }

  public Client getClient() {
    return client;
  }
}
