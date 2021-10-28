#ifndef MI_H
#define MI_H

class Mi  : public NotaPrototype
{
public:
	Mi(){
		this.note="mi";
	}
	void print()
	{
		std::cout<<note;
	}
	Mi clone()
	{
		return this;
	}
protected:
};

#endif
