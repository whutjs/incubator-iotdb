package cn.edu.thu.tsfiledb.conf;

public class TsfileDBConfig {
	/**
	 * the maximum number of writing instances existing in same time.
	 */
	public int writeInstanceThreshold = 5;

	/**
	 * data directory of Overflow data
	 */
	public String overflowDataDir = "src/main/resources/data/overflow";
	/**
	 * data directory of fileNode data
	 */
	public String FileNodeDir = "src/main/resources/data/digest";
	/**
	 * data directory of bufferWrite data
	 */
	public String BufferWriteDir = "src/main/resources/data/delta";

	public String metadataDir = "src/main/resources/metadata";

	public String derbyHome = "src/main/resources/derby";

	/**
	 * maximum concurrent thread number for merging overflow
	 */
	public int mergeConcurrentThreadNum = 10;
	/**
	 * the maximum number of concurrent file node instances
	 */
	public int maxFileNodeNum = 1000;
	/**
	 * the maximum number of concurrent overflow instances
	 */
	public int maxOverflowNodeNum = 100;
	/**
	 * the maximum number of concurrent buffer write instances
	 */
	public int maxBufferWriteNodeNum = 50;
	public int defaultFetchSize = 10000;

	/**
	 * System log folder.
	 */
	public String walFolder = "src/main/resources/wals";
	public int LogCompactSize = 500000;
	public int LogMemorySize = 10000;
	public long LogMergeTime = 10;

	public int JDBCServerPort = 6667;
	
	public String JMXIP = "0.0.0.0";
	
	// port registered to jmx
	public int JMXPort = 31999;
	
	public TsfileDBConfig() {
	}

}
