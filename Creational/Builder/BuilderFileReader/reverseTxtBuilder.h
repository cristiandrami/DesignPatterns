#ifndef PDFBUILDER_H
#define PDFBUILDER_H
#include<string>
#include<iostream>
#include <fstream> 
#include<vector>
#include"fileBuilder.h"


class ReverseTxtBuilder : public FileBuilder
{
    public:
    ReverseTxtBuilder()
    {
        file.open("resultReverseFile.txt");
    }
 
    void addLine(std::string line){lines.push_back(line);}
    void createFile()
    {
        
        for(int i=lines.size()-1; i>=0; i--)
        {
            file<<lines[i];
        }
        file.close();
        
    }

    private:
    std::ofstream file;
    std::vector<std::string> lines;

};


#endif