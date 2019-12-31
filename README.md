# Things

The main of the project is in class GUImain in folder UI


This read me only declares what the original functioalities of the project do and where they in which classes


Class Brand:
this class  contains brand informtion of each brand.

Class BrandFunctions
this class  contains the database for the brands (which is the arraylist) and each function that can be executed for a brand.

Class IBrand:
this is an abstraction of class Brand to be able to code to an interface not implementation.

Class ProductSpec:
this is an abstract class that carries the information for class product which help up to code to an abstraction.

Class Product:
this class extends ProductSpec and its constructor creates a new Product object.

Class AdminStatistics:
this class carries implementation for stat calculations.

Class Cart:
this class carries the arrayList for carts and their items for each user that can buy products and it includes all the functions performed on the cart.

Class CartItem:
this class conatins the information for an item added to the cart.

Class Collaboraters:
this classs carries information for each collaborater.

Class History:
implementation for the information that is added to the store history.

Class ISoreProduct:
interface for the information for a product added by storeOwner in their store.

Class Offers:
this class carries informmation for the offers  added to final price of the order.

Class Order:
this class enables user to enter address and calculate full price and checkout the whole cart.

Class PersonalInfo:
interface that carries the setters and getters of the information for a user.

Class ProductInventory:
somekind of database for the products that the admin adds also the functionalities applied to them.

Class Statistics:
database of stats for the system.

Class StoreSpec:
abstract class that carries information for store that helps with coding to abstraction.

Class Store:
a concrete object of the storeSpec as it extends the StoreSpec class.

Class StoreFunctionalities:
responsible for the all the information saving and functionalities performed for the store.

Class StoreOffer:
an object of that class is created by storeOwner to enable them to add an offer to one of their stores and this offer is applied to all StoreProducts bought form that store.

Class StoreProduct:
implementation for a product added by storeOwner to their store.

Class User:
implements personalInfo, a concrete object of a user.

Class UserFunctionalities:
database for the user also carries out the functionaliteis executed for a user.

Class UserType:
an enum class that enables us to differentiate between different types of users(StoreOwner,Buyer,Admin)


ControllersPackage:

Class Admoin_Controller:
handles the functionalities of the admin like addproduct or add brand or verify a store. it communicates with other controllers to carry out the functionalities. an exampele of a controller it interacst with is Store_Controller to access the nonverified and verified stores.

Class User_Controller:
this class handles login and register. in our  project only Buyyer and StoreOwner users can register as not anyone can be an Admin.

Class Store_Controller:
connects with StoreFunctionalities and Statistics to have access to their functionalites.

Class SO_Controller:
Store Owner Controller communicates with other controllers to carry out the owner functionalitels.


UI Package:

GUImain:
is our main class, is where we start the project. all the variable objects are intitialized here and are sent to their appropriate controllers and functions. here we login and according to the usertype , they get redirected to the appropriate UI.

SOUI:
store owner Ui. takes inputs and communicates them to the appropriate controller which in turn communicates them to the appropriate implementation. it also contains a button which enables the store owner to become a buyer and carry out buyer funcs.

StoreUI:
once the storeOwner chooses one of their stores form the list displayed in SOUI, they get directed to thsi class which containes the calling of the functionalities performed on a store.each store has its own unique number.

BuyerUI:
communicates with controllers to display items in stores and adds to cart and checksout.

AdminUI:
contains buttons that open windows to perform admin funcs. these windows take inputs to carry out appropriate function like for example verify a store that is in the QueingList.

Displays:(All display classes)
they only display the contents of certain arraylists to help the user chooses from various objects.




