package adapter;

import java.io.File;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import tree.Tree;

public class TreeAdapter extends Tree{
	private File fileSystem=new File("src/");
	public TreeAdapter(JFrame frame) {
		super(frame);
		
	}
	
	
	//sto adattando la classe JTree che si aspetta una stringa con File che mi ritorna un file appunto
	private void createTree()
	{
		//mi prendo i file che sono in quella cartella LA CARTELLA DA CUI COMINCIO
		//LA PRIMA VOLTA DEVO VEDERE TUTTE I FUOI FILE E CARTELLE
        File file[] = fileSystem.listFiles();
        DefaultMutableTreeNode root= new DefaultMutableTreeNode();

        //li scorro
        for(File files: file)
        {
        	//se è una cartella stampo il suo nome
            if(files.isDirectory())
            {
            	DefaultMutableTreeNode dir=  new DefaultMutableTreeNode(files.getName());
            	root.add(dir);
                
                //ora cerco di vedere se ci sono altri files al suo interno e chiamo la funziona che me li controlla
                //uguale a questa e gli agggiungo un \t così da farlo sembrare graficamente migliore
                listfiles(files,dir);
            }
            else
            {
            	//se è un file scrivo il suo nome
            	root.add(new DefaultMutableTreeNode(files.getName()));
               
            }
        }
        
        this.tree= new JTree(root);
	}
	
	public void drawTree() {
		createTree();
		super.frame.add(this.tree);
    }


    private void listfiles(File files,DefaultMutableTreeNode root)
    {
    	//prendo il file che ho trovato sella funzione sopra e faccio lo stesso procedimento
        File file[] = files.listFiles();
        for(File fileCurrent: file)
        {
            if(fileCurrent.isDirectory())
            {
            	DefaultMutableTreeNode dir= new DefaultMutableTreeNode(fileCurrent.getName());
            	root.add(dir);
                
               
                //qua faccio una ricorsione in modo che possa ottenere tutti i file dentro se è una cartella
                // INFATTI CHIAMO LA FUNZIONE, SE C'È UN'ALTRA CARTELLA VADO DENTO E PRENDO I FILE
                // SE C'È UNA NUOVA CARTELLA DENTRO PRENDO I FILE SUOI E COSÌ VIA
                listfiles(fileCurrent,dir);
            }
            else
            {
            	root.add(new DefaultMutableTreeNode(fileCurrent.getName()));
               
            }
        }
    }

	

}
