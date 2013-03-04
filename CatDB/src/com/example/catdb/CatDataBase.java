package com.example.catdb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.util.Log;

public class CatDataBase extends SQLiteOpenHelper implements BaseColumns
{
	private static final String DATABASE_NAME = "cat_database.db";
	private static final int DATABASE_VERSION = 1;
	public static final String TABLE_NAME = "contact_table";
	public static final String CATNAME = "catname";

	private static final String SQL_CREATE_ENTRIES = "CREATE TABLE "
			+ TABLE_NAME + " (" + CatDataBase._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
			+ CATNAME + " VARCHAR(255));";

	private static final String SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS "
			+ TABLE_NAME;
	
	public CatDataBase(Context context)
	{
		// TODO Auto-generated constructor stub
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	@Override
	public void onCreate(SQLiteDatabase db)
	{
		// TODO Auto-generated method stub
		db.execSQL(SQL_CREATE_ENTRIES);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
	{
		// TODO Auto-generated method stub
		Log.w("LOG_TAG", "Обновление базы данных с версии " + oldVersion
				+ " до версии " + newVersion + ", которое удалит все старые данные");
		// Удаляем предыдущую таблицу при апгрейде
		db.execSQL(SQL_DELETE_ENTRIES);
		// Создаём новый экземпляр таблицы
		onCreate(db);
	}

}
