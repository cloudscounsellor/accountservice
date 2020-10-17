package org.modelbank;



public class Account   {
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountType == null) ? 0 : accountType.hashCode());
		result = prime * result + ((currentAccountBalance == null) ? 0 : currentAccountBalance.hashCode());
		result = prime * result + ((customerID == null) ? 0 : customerID.hashCode());
		result = prime * result + ((dateClosed == null) ? 0 : dateClosed.hashCode());
		result = prime * result + ((dateOpened == null) ? 0 : dateOpened.hashCode());
		result = prime * result + ((lastUpdatedBy == null) ? 0 : lastUpdatedBy.hashCode());
		result = prime * result + ((lastUpdatedDate == null) ? 0 : lastUpdatedDate.hashCode());
		result = prime * result + ((minAccountBalance == null) ? 0 : minAccountBalance.hashCode());
		result = prime * result + ((nomineeUpdated == null) ? 0 : nomineeUpdated.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountType == null) {
			if (other.accountType != null)
				return false;
		} else if (!accountType.equals(other.accountType))
			return false;
		if (currentAccountBalance == null) {
			if (other.currentAccountBalance != null)
				return false;
		} else if (!currentAccountBalance.equals(other.currentAccountBalance))
			return false;
		if (customerID == null) {
			if (other.customerID != null)
				return false;
		} else if (!customerID.equals(other.customerID))
			return false;
		if (dateClosed == null) {
			if (other.dateClosed != null)
				return false;
		} else if (!dateClosed.equals(other.dateClosed))
			return false;
		if (dateOpened == null) {
			if (other.dateOpened != null)
				return false;
		} else if (!dateOpened.equals(other.dateOpened))
			return false;
		if (lastUpdatedBy == null) {
			if (other.lastUpdatedBy != null)
				return false;
		} else if (!lastUpdatedBy.equals(other.lastUpdatedBy))
			return false;
		if (lastUpdatedDate == null) {
			if (other.lastUpdatedDate != null)
				return false;
		} else if (!lastUpdatedDate.equals(other.lastUpdatedDate))
			return false;
		if (minAccountBalance == null) {
			if (other.minAccountBalance != null)
				return false;
		} else if (!minAccountBalance.equals(other.minAccountBalance))
			return false;
		if (nomineeUpdated == null) {
			if (other.nomineeUpdated != null)
				return false;
		} else if (!nomineeUpdated.equals(other.nomineeUpdated))
			return false;
		return true;
	}
	private String dateOpened;
	private String dateClosed;
	private String accountType;
	private String customerID;
	private String currentAccountBalance;
	private String minAccountBalance;
	private String nomineeUpdated;
	private String lastUpdatedDate;
	private String lastUpdatedBy;
	public String getDateOpened() {
		return dateOpened;
	}
	public void setDateOpened(String dateOpened) {
		this.dateOpened = dateOpened;
	}
	public String getDateClosed() {
		return dateClosed;
	}
	public void setDateClosed(String dateClosed) {
		this.dateClosed = dateClosed;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getCurrentAccountBalance() {
		return currentAccountBalance;
	}
	public void setCurrentAccountBalance(String currentAccountBalance) {
		this.currentAccountBalance = currentAccountBalance;
	}
	public String getMinAccountBalance() {
		return minAccountBalance;
	}
	public void setMinAccountBalance(String minAccountBalance) {
		this.minAccountBalance = minAccountBalance;
	}
	public String getNomineeUpdated() {
		return nomineeUpdated;
	}
	public void setNomineeUpdated(String nomineeUpdated) {
		this.nomineeUpdated = nomineeUpdated;
	}
	public String getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(String lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

 

   

  

  
}
