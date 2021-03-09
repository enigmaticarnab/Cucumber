package dataProvider;

public class FileReaderManager {
	
private static FileReaderManager fileReaderManager = new FileReaderManager();
private static ConfigFileReader  configFileReader;
private FileReaderManager() {}

public static FileReaderManager getInstance()
{
	return fileReaderManager;
}
public ConfigFileReader getConfigReadrer() {
	return (configFileReader== null)? new ConfigFileReader():configFileReader;
}

}
