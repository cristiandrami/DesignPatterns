package main;

import java.io.File;
import java.io.IOException;

import javax.swing.filechooser.FileSystemView;

public class MyFileSystemViewerAdapter implements MyFileSystemViewer{

	private File fileSystem=new File("/home/cristian/Scrivania/prova");
	
	private String test= "";
	/*public void printFileSystemTree() {
		if(fileSystem!=null)
			System.out.println("[Directory]" +fileSystem.getName());
		recursivePrinting(fileSystem);
		//System.out.println("Done");
		
		
	}
	
	private void recursivePrinting(File file)
	{
		File[] allFiles= file.listFiles();
		if (allFiles != null) {
			
	        for (File currentFile: allFiles) {
	            if (currentFile.isDirectory()) {
	              System.out.println("\t\t\t\t[Directory]" +currentFile.getName()+"|");  
	              recursivePrinting(currentFile);
	            } else {

	                System.out.println("\t\t\t\t[File]"+currentFile.getName().toString());

	            }
	        }
		
		}
		
	}
	*/
	public void printFileSystemTree() {
	
		//mi prendo i file che sono in quella cartella LA CARTELLA DA CUI COMINCIO
		//LA PRIMA VOLTA DEVO VEDERE TUTTE I FUOI FILE E CARTELLE
        File file[] = fileSystem.listFiles();

        //li scorro
        for(File files: file)
        {
        	//se è una cartella stampo il suo nome
            if(files.isDirectory())
            {
                System.out.println("[Directory] "+files.getName());
                test+="[Directory] "+files.getName();
                //ora cerco di vedere se ci sono altri files al suo interno e chiamo la funziona che me li controlla
                //uguale a questa e gli agggiungo un \t così da farlo sembrare graficamente migliore
                listfiles(files,"\t ");
            }
            else
            {
            	//se è un file scrivo il suo nome
                System.out.println("[file] "+files.getName());
                test+="[file] "+files.getName();
            }
        }
    }


    private void listfiles(File files,String predecessor)
    {
    	//prendo il file che ho trovato sella funzione sopra e faccio lo stesso procedimento
        File file[] = files.listFiles();
        for(File fileCurrent: file)
        {
            if(fileCurrent.isDirectory())
            {
                System.out.println(predecessor+"[Directory]"+fileCurrent.getName());
                test+=predecessor+"[Directory]"+fileCurrent.getName();
                //qua faccio una ricorsione in modo che possa ottenere tutti i file dentro se è una cartella
                // INFATTI CHIAMO LA FUNZIONE, SE C'È UN'ALTRA CARTELLA VADO DENTO E PRENDO I FILE
                // SE C'È UNA NUOVA CARTELLA DENTRO PRENDO I FILE SUOI E COSÌ VIA
                listfiles(fileCurrent,"\t"+predecessor);
            }
            else
            {
                System.out.println(predecessor+"[file]"+fileCurrent.getName());
                test+=predecessor+"[file]"+fileCurrent.getName();
            }
        }
    }

    
    public String getTest()
    {
    	return test;
    }
	

		
	

}
