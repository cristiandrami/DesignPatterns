#ifndef NOTESGESTOR_H
#define NOTESGESTOR_H
#include<NotaPrototype.h>
#include<Do.h>
#include<Re.h>
#include<Mi.h>

#include<vector>
class NotesGestor
{
	public:
		std::vector<NotaPrototype> notes;
		NotesGestor()
		{
			
		}
		
		void init()
		{
			notes.push_back(Do());
			notes.push_back(Re());
			notes.push_back(Mi());
		}
		
		NotaPrototype getNote(int index)
		{
			if(index<notes.size() && index>=0)
			{
				return notes[index];
				
			}
		}
	protected:
};

#endif
