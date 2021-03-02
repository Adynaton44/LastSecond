import java.io.File;

import javax.swing.filechooser.FileFilter;

public class CsvFileFilter extends FileFilter {

	@Override
	public boolean accept(File f) {
		
		if(f.getName().endsWith(".csv")) {
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

}
