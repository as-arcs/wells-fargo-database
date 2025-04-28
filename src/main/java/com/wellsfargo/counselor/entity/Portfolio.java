package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;

@Entity
public class Portfolio {
  @Id
  @GeneratedValue()
  private long portfolioId;

  @OneToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "client_Id")
  private Client client;

  @Column(nullable = false)
  private long creationDate;

  public void setId(Long portfolioId, Long creationDate) {
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
