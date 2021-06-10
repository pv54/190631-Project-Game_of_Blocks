# MetaCoin Loan Contract
## Instructions to test the contract
* Open the Remix IDE and create a new *.sol file. For steps ahead, we will refer this file by metacoinloantest.sol.

* Copy and Paste the code present inside metacoinloan.sol in metacoinloantest.sol and compile the code.

* On the left sidebar in Remix IDE, choose the option to Deploy the Smart Contract..

### Getting the compound interest
* enter the values of priciple,interest,time as integers in the getCompoundInterest function and click on call to get the compound interest.
* Requesting the owner to settle the loan
* First select any other account from the Account drop down menu.

* Now Click on the reqLoan button and provide the values of principle,interest,time as integers and click on transact.

* This would Emit a Request event and add the amount in the loans mapping of the contract owner i.e. account 1.

### Getting owner's balance
* First select any account from the Account drop down menu.

* Now click on the getOwnerBalance button in the contract.

* It will display the owner's current account balance.

### Viewing dues
* First select account 1 from the menu because only the owner of contract can use this function.

* Click on the viewDues button and provide the address of the requestor's account.

* Click on call and you will get the amount of money you owe to that account.

### Settling dues
* First select account 1 from the menu because only the owner of contract can use this function.

* Click on the viewDues button and provide the address of the requestor's account.

* Click on transact and the loan amount would the transferred to the requestor's account only if there is sufficient balance in the account.
