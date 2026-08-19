/*
A milk carton can hold 3.78 liters of milk. Each morning, a dairy farm ships cartons of milk to a local grocery store. The cost of producing one liter of milk is $0.38, and the profit of each carton of milk is $0.27.

Write a program that prompts the user to enter:

The total amount of milk produced in the morning.
The program then outputs:

The number of milk cartons needed to hold the milk.
Round your answer to the nearest integer.
The cost of producing the milk.

The profit for producing the milk.
*/


#include <iostream>
#include <cmath>

using namespace std;

int main() {
    // Write your main here

    double total_liter_per_carton;
    double cost_per_liter;
    double profit_per_carton;
    double totalCost;
    double morningProduce;
    int totalCartons;
    double totalProfit;

    //Milk carton can hold 3.78 liters 
    total_liter_per_carton = 3.78;

    //cost of producing one liter is 0.38
    cost_per_liter = 0.38;

    // A profit per carton
    profit_per_carton = 0.27;

    //Milk produced everyday
    cout<<"Enter total amount of milk produced in the morning: ";

    cin >> morningProduce;

    // Total cartons to hold milk

    totalCartons = round(morningProduce/total_liter_per_carton);

    // Total cost of producing the milk

    totalCost = cost_per_liter * morningProduce;

    // Profit for producing the milk

    totalProfit = totalCartons * profit_per_carton;

    cout<<morningProduce<<endl;
    cout<<totalCartons<<endl;
    cout<<totalCost<<endl;
    cout<<totalProfit<<endl;


    return 0;
}