#ifndef DIRECTOR_H
#define DIRECTOR_H
#include"fileBuilder.h"
#include<string>
class Director
{
    public:
    Director(FileBuilder* f){fileBuilder=f;}
    void addLine(std::string line){ (*fileBuilder).addLine(line);}
    void parse()
    {
        if(read.is_open()) 
        {
            while(read.good())
            {
                std::string line;
                std::getline (read, line);
                director.addLine(line+"\n");
            }    
        }

    (*fileBuilder).createFile();

    }
    

    private:
    FileBuilder* fileBuilder;

};


#endif