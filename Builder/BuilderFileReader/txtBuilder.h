#ifndef TXTBUILDER_H
#define TXTBUILDER_H
#include<string>
#include<iostream>
#include <fstream> 
#include"fileBuilder.h"


class TxtBuilder : public FileBuilder
{
    public:
    TxtBuilder()
    {
        file.open("resultFile.txt");
    }
 
    void addLine(std::string line){file<<line;}
    void createFile(){file.close();}

    private:
    std::ofstream file;

};


#endif