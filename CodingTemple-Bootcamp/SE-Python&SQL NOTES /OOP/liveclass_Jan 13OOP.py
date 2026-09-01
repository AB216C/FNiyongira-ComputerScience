##### BANKING SYSTEM #########

# 1. CREATE A BANK ACCOUNT CLASS
#Purpose Managing transactions

class BankAccount():
  #Constructor methods
  def __init__(self, account_holder, balance=0.00):
    self.account_holder = account_holder
    self.balance = balance

#methods to perform the transaction include(deposit, withdrawal, and check balance)

#Deposit_methods
  def deposit(self, deposit_amount):
    if (deposit_amount>0):
      self.balance +=round(deposit_amount,2)
      print(f"${deposit_amount} added to your account. Your new balance is ${self.balance}")
    else:
      print("Deposit must be greater than zero")

#withdraw_methods [Enforcing withdraw with two decimal points]
#Eg:withdrawal amount = 34.4567

  def withdraw(self,withdraw_amount):
    if(withdraw_amount>0):
      if (self.balance > withdraw_amount):
        string_withdraw_amount = str(withdraw_amount)
        index_of_point = string_withdraw_amount.index(".")
        sliced = string_withdraw_amount[index_of_point +1:]
        number_of_decimals = len(sliced)
        if number_of_decimals >2:
          print("print amount with two decimals")
        else:
          self.balance -= withdraw_amount
          print(f"${withdraw_amount} has beend deducted from your account. Your new balance is {self.balance}")
      else:
        print("Insufficient funds")
    else:
      print("Withdrawal amount must be greater than zero")

# #####################calculating lenght of decimals########################
# num = 50.54
# string_num = str(num)
# index_of_point = string_num.index(".")
# print(index_of_point)
# sliced = string_num[index_of_point +1:]
# number_of_decimals = len(sliced)
# print(sliced)
# print(number_of_decimals)

#check_balance method
  def check_balance(self):
    print(f"The account holder:{self.account_holder}, Balance:{self.balance}")

#BANK CLASS: Management of multiple bank accounts, allow users to open new accounts
#  and interact with their accounts
#
class Bank:
  def __init__(self):
    self.accounts={}

  def create_account(self,account_holder):
    if account_holder not in self.accounts:
      new_account = BankAccount(account_holder)
      self.accounts[account_holder] = new_account
      print(f"The acount created for {account_holder}.")
    else:
      print(f"Account already exists for {account_holder}")

  
# Get_account method

  def get_account(self, account_holder):
    if account_holder in self.accounts:
      return self.accounts[account_holder]
    else:
      print(f"Account for {account_holder} does not exist")

######CREATING CLI TO INTERCACT WITH BANK SYSTEM: CLI is also called Runner
#CLI: Command Line Interface
#Advantage of CLI: Run scripts, automate tasks, manage tasks and scripts development more efficiently
#starts with def runner() or def main() functions

def runner():
  #creating instance of a bank class
  bank = Bank()
  #Using while loop for interactivity
  while True:
    #print valid options to the command line
    print('''
******************************Bank Menu System***************************************
          1. Create Account
          2. Deposit Money
          3. Withdraw Money
          4. Check balance
          5. Exit

''')
    #asking the users for inputs
    choice = input("What would you like to do today? (Choose a number)")

    if (choice == '1'):
      name = input("What is your name? ")
      bank.create_account(name)

    elif (choice == '2'):
      name = input("What is your name? ")
      account = bank.get_account(name)

      if account:
        amount = float(input("How much would you like to deposit? "))
        account.deposit(amount)
    elif (choice =='3'):
      name = input("What is your name?")
      account = bank.get_account(name)

      if account:
        amount = float(input("How much would you like to withdraw? "))
        account.withdraw(amount)
    elif (choice == '4'):
      name = input("What is your name?")
      account = bank.get_account(name)

      if account:
        account.check_balance()

    elif (choice == '5'):
      print("Thank you for banking with us! Havea good day")
      break
    else:
      print("Invalid choice. Please try again. Choose a number between 1-5")

#run the program
runner()






