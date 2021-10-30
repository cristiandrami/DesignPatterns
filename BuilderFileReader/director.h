#ifndef DIRECTOR_H
#define DIRECTOR_H
#include"fileBuilder.h"
#include<string>
class Director
{
    public:
    Director(FileBuilder* f){fileBuilder=f;}
    void addLine(std::string line){ (*fileBuilder).addLine(line);}
    

    private:
    FileBuilder* fileBuilder;

};


#endif