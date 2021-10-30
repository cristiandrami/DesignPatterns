#ifndef FILEBUILDER_H
#define FILEBUILDER_H
#include<string>

class FileBuilder
{
    public:
    FileBuilder(){}
    virtual void addLine(std::string line){}
    virtual void createFile(){}

};


#endif