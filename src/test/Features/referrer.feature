Feature: As a Admin user I
  should be able to add new referrer



  #Scenario Outline: : Validate referrer functionality
   Scenario Outline: Validate referrer functionality
    Given  I am on home page
    When  Enter username "admin@coaching.com"
    When Enter password "22091671"
    When Click login

    When Click referre
    When Click addreferrer
   #When Enter referrername "Jamie"
    When Enter referrername "<referrername>"
    #When Enter referreremailid "jamie.leo@gmail.com"
    When Enter referreremailid "<referreremailid>"
     #When Enter referrerphone "12356987452"
    When Enter referrerphone "<referrerphone>"

    When Click addreferrer1
    Then Admin should be able to see successful message "Referrer added successfully"



    Examples:
    |referrername |referreremailid        |referrerphone|
    #|Kelly      |kelly.asc@gmail.com      |12358347456  |
    |kumar        |kumar84.nks@gmail.com    |25648236125  |
    #|arun     |arun.salm@gmail.com      |36987524589  |
    #|Ruba      |ruba.brf@gmail.com       |65897452658  |


