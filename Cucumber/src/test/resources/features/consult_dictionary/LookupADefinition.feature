Feature: Lookup a definition
  In order to talk better
  As an English student
  I want to look up word definitions

  Scenario: Looking up the definition of 'Drones'
    Given the user is on the Wikionary home page
    When the user looks up the definition of the word 'mi muchacho Diomedes Dias'
    When the user click in the video
    When the user click in the bootom share
    When the user click in the bootom facebook
    When the User Start Sesion In Facebook 'luferoas537@gmail.com' 'luisfernando'
    #Then they should see the definition 'apples'

    #Scenario: Looking up the definition of 'pear'
    #Given the user is on the Wikionary home page
    #When the user looks up the definition of the word 'pear'
    #Then they should see the definition 'An edible fruit produced by the pear tree, similar to an apple but elongated towards the stem.'
