package TraineeDemo.exercise.utils;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class atomic

{
	// ---( internal utility methods )---

	final static atomic _instance = new atomic();

	static atomic _newInstance() { return new atomic(); }

	static atomic _cast(Object o) { return (atomic)o; }

	// ---( server methods )---




	public static final void sleep (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(sleep)>> ---
		// @sigtype java 3.5
		// [i] field:0:required sleepTime
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	sleepTime = IDataUtil.getString( pipelineCursor, "sleepTime" );
			int sleepTimeInt = 0;
			if (sleepTime != null) {
				sleepTimeInt = Integer.parseInt(sleepTime);
			}
			try {
				Thread.sleep(sleepTimeInt);
			}catch (Exception e) {
				throw new ServiceException(e);
			}
		pipelineCursor.destroy();
		
		// pipeline
		// --- <<IS-END>> ---

                
	}
}

