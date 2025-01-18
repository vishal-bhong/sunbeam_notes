#include <iostream>
#include <vector>
using namespace std;
class Product
{
public:
    int pid;
    string pname;
    double price;

    Product()
    {
    }
    Product(int pid, string pname, double price)
    {
        this->pid = pid;
        this->pname = pname;
        this->price = price;
    }
    void acceptProduct()
    {
    }

    void displayProduct()
    {
    }
};

class Customer
{
public:
    int cid;
    string name;
    vector<Product *> purchasedProduct;

    void accept()
    {
    }

    void display()
    {
    }

    void purchaseProduct(vector<Product *> &productList)
    {
        int id;
        for (int i = 0; i < productList.size(); i++)
            productList[i]->displayProduct();
        cout << "Enter product id to purchase - ";
        cin >> id;

        for (int i = 0; i < productList.size(); i++)
            if (id == productList[i]->pid)
                purchasedProduct.push_back(productList[i]);

        // Product *p = new Product();
    }

    void displayPurchasedProduct()
    {
        for (int i = 0; i < purchasedProduct.size(); i++)
            purchasedProduct[i]->displayProduct();
    }
};

Customer *findCustomer(vector<Customer *> &customerList)
{
    if (true)
        return customerList[0];
    return NULL;
}

int main()
{
    vector<Product *> productList;
    vector<Customer *> customerList;

    // case - Add Product (Adding new Products for sale)
    Product *p = new Product();
    p->acceptProduct();
    productList.push_back(p);

    // dummy data for me
    productList.push_back(new Product(1, "Pen", 10));
    productList.push_back(new Product(2, "Notebook", 60));
    productList.push_back(new Product(3, "Eraser", 5));

    // case - Add Customer
    Customer *c = new Customer();
    c->accept();
    customerList.push_back(c);

    // case - PurchaseProduct
    // int index = findCustomer();
    Customer *c = findCustomer(customerList);
    if (c != NULL)
    {
        c->purchaseProduct(productList);
    }

    // case- display specific customer product
    Customer *c = findCustomer(customerList);
    if (c != NULL)
    {
        c->displayPurchasedProduct();
    }

    // display all customer purchased product
    for (int i = 0; i < customerList.size(); i++)
    {
        customerList[i]->display();
        customerList[i]->displayPurchasedProduct();
    }
    return 0;
}