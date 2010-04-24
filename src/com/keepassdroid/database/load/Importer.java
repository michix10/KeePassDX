/*
 * Copyright 2009 Brian Pellin.
 *     
 * This file is part of KeePassDroid.
 *
 *  KeePassDroid is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  KeePassDroid is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with KeePassDroid.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.keepassdroid.database.load;

import java.io.IOException;
import java.io.InputStream;

import com.keepassdroid.UpdateStatus;
import com.keepassdroid.database.PwDatabase;
import com.keepassdroid.database.exception.InvalidDBSignatureException;
import com.keepassdroid.database.exception.InvalidKeyFileException;
import com.keepassdroid.database.exception.InvalidPasswordException;

public abstract class Importer {

	public static final boolean DEBUG = true;
	protected final boolean mDebug;
	
	public Importer() {
		mDebug = false;
	}

	public Importer(boolean debug) {
		mDebug = debug;
	}

	public abstract PwDatabase openDatabase( InputStream inStream, String password, String keyfile ) 
		throws IOException, InvalidKeyFileException, InvalidPasswordException, InvalidDBSignatureException;

	public abstract PwDatabase openDatabase( InputStream inStream, String password, String keyfile, UpdateStatus status ) 
		throws IOException, InvalidKeyFileException, InvalidPasswordException, InvalidDBSignatureException;


}