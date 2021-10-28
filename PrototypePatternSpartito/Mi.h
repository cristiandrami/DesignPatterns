#ifndef MI_H
#define MI_H

class Mi  : public NotaPrototype
{
public:
	Mi(){
		note="mi";
	}
	void print()
	{
		std::cout<<note;
	}
	NotaPrototype* clone()
	{
		return this;
	}
protected:
};

#endif
