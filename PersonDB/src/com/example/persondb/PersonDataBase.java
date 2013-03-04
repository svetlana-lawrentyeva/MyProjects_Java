package com.example.persondb;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.util.Log;

public class PersonDataBase extends SQLiteOpenHelper implements BaseColumns
{
	private static final String DATABASE_NAME = "person_database.db";
	private static final int DATABASE_VERSION = 1;
	public static final String TABLE_NAME = "person";
	public static final String FNAME = "fname";
	public static final String LNAME = "lname";
	public static final String AGE = "age";

	private static final String SQL_CREATE_ENTRIES = "CREATE TABLE "
			+ TABLE_NAME + " (" + 
			PersonDataBase._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
			FNAME + " VARCHAR(255)," +
			LNAME + " VARCHAR(255)," +
			AGE + " INTEGER);";

	private static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS "
			+ TABLE_NAME;
	public PersonDataBase(Context context)
	{
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db)
	{
		db.execSQL(SQL_CREATE_ENTRIES);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
	{
		Log.w("LOG_TAG", "Обновление базы данных с версии " + oldVersion
				+ " до версии " + newVersion + ", которое удалит все старые данные");
		db.execSQL(SQL_DELETE_ENTRIES);
		onCreate(db);
	}

}
