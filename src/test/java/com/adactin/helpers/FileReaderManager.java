package com.adactin.helpers;

public class FileReaderManager {

private FileReaderManager() {

}
public static  FileReaderManager getInstance() {
FileReaderManager fl = new FileReaderManager();
return fl;

}
public  ConfigurationReader getInstanceCR() throws Throwable {
	ConfigurationReader cr = new ConfigurationReader();
	return cr;


}


}
