﻿using System.Collections.Generic;
using System.Data;
using System.IO;

namespace Altman.Util.Data
{
    public static class Db
    {
        private static string _databasePath = "";
	    private static string _connectionString = "";

		public static void Init(string databasePath)
		{
			_databasePath = databasePath ?? "data.db3";
			//初始化数据库
			CheckDb(_databasePath);
	    }

        /// <summary>
        /// 检查数据库文件
        /// </summary>
        private static void CheckDb(string dbPath)
        {
            //如果不存在数据库文件，则创建该数据库文件
            if (!File.Exists(dbPath))
            {
                //创建数据库
                SqliteHelper.CreateDb(dbPath);
            }
            //设置数据库连接语句
			_connectionString = string.Format("Data Source={0}", _databasePath);
        }
        /// <summary>
        /// 检查数据库表
        /// </summary>
        public static bool CheckTable(string tableName)
        {
            //判断数据库是否含有指定表
			DataTable dt = SqliteHelper.GetSchema(_connectionString);
            bool isAvailableDb = false;
            foreach (DataRow row in dt.Rows)
            {
                if ((string)row["TABLE_NAME"] == tableName && (string)row["TABLE_TYPE"] == "table")
                {
                    isAvailableDb = true;
                    break;
                }
            }
            return isAvailableDb;
        }
        /// <summary>
        /// 创建表
        /// </summary>
        public static bool InitTable(string tableName, string[] definition)
        {
			return CheckTable(tableName) || SqliteHelper.CreateTable(_connectionString, tableName, definition);
        }
        /// <summary>
        /// 删除数据
        /// </summary>
        public static bool Delete(string tableName, KeyValuePair<string,object> where)
        {
			return SqliteHelper.Delete(_connectionString, tableName, where);
        }
        /// <summary>
        /// 插入数据
        /// </summary>
        public static bool Insert(string tableName, Dictionary<string, object> data)
        {
			return SqliteHelper.Insert(_connectionString, tableName, data);
        }
        /// <summary>
        /// 更新数据
        /// </summary>
        public static bool Updata(string tableName, Dictionary<string, object> data, KeyValuePair<string,object> where)
        {
			return SqliteHelper.Update(_connectionString, tableName, data, where);
        }
        /// <summary>
        /// 获取数据库表
        /// </summary>
        public static DataTable GetDataTable(string tableName)
        {
            string sql = string.Format("select * from {0};", tableName);
	        return SqliteHelper.ExecuteDataTable(_connectionString, sql, null);
        }
    }
}
