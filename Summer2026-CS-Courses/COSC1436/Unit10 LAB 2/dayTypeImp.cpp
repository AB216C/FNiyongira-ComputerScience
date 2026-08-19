
// This is a new file WAS EMPTTY

#include <iostream>
#include <string>
#include "dayType.h"


using namespace std;


string dayType::weekDays[]=
{
    "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
};

void dayType::print() const
{
    cout<<weekDay;
}


string dayType::nextDay() const
{
    for (int i=0; i<7; i++)
    {
        if(weekDay == weekDays[i])
        {
            return weekDays[(i+1)%7];
        }

    }
    return "";
}

string dayType::prevDay() const
{
    for (int i=0; i<7; i++)
    {
        if(weekDay == weekDays[i])
        {
            return weekDays[(i+6)%7];
        }

    }

    return "";

}

void dayType::addDay(int nDays)
{
    for (int i=0; i<7; i++)
    {
        if(weekDay == weekDays[i])
        {
            weekDay = weekDays[(i+nDays)%7];

            return;
        }
    }

}

void dayType::setDay(string d)
{
    weekDay = d;
}

string dayType::getDay() const
{
    return weekDay;
}

dayType::dayType()
{
    weekDay = "Sunday";
}

dayType::dayType(string d)
{
    weekDay = d;
}


