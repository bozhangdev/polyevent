using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;
using System.Web;

namespace Room
{
    // 注意: 使用“重构”菜单上的“重命名”命令，可以同时更改代码和配置文件中的类名“Service1”。
    public class Service1 : IService1
    {
        System.Web.Caching.Cache rooms = HttpRuntime.Cache;

        public Boolean QueryRoomNumber(string date, int number)
        {
            init();
            if (((int)rooms[date]) >= number)
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        public void init()
        {
            rooms.Insert("2018/04/01", 0);
            rooms.Insert("2018/04/02", 0);
            rooms.Insert("2018/04/03", 5);
            rooms.Insert("2018/04/04", 15);
            rooms.Insert("2018/04/05", 20);
        }
    }
}
