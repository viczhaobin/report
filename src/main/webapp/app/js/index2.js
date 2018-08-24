$(function() {
    //App.init();

    var Index = (function() {
        var me = {};

        // ����һ���˵����
        me.handleMenuClick = function() {
            $('#page-sidebar-menu > li').click(function(e) {
                var menu = $('#page-sidebar-menu');
                var li = menu.find('li.active').removeClass('active');

                if("btn-dashboard" == this.getElementsByTagName("a")[0].getAttribute("id"))
                {
                    var pageTitle = document.getElementsByClassName("page-title")[0];
                    pageTitle.innerHTML = "�Ǳ���";                    

                    $('#page-sidebar-menu li ul li').removeClass("active1");
                    console.log("aaaa");
                    //��ȡ�����Ľڵ�
                    var pul = document.getElementsByClassName("page-breadcrumb breadcrumb")[0];

                    //��һ���˵�
                    var ch1 = pul.childNodes[1];
                    var ch1i1 = ch1.childNodes[1];
                    var ch1a1 = ch1.childNodes[3];
                    ch1i1.setAttribute("class","fa fa-cogs");
                    ch1a1.setAttribute("href","#");
                    ch1a1.innerHTML = "��ҳ";

                    //�ڶ����˵�
                    var ch2 = pul.childNodes[3];
                    var ch2a1 = ch2.childNodes[1];
                    ch2a1.setAttribute("href","indexTemp.html");
                    ch2a1.innerHTML = "�Ǳ���";

                }

                // ���ѡ�� �򿪵���ʽ
                //$(this).addClass('active');

            });
        };

        // �����Ӳ˵����
        me.handleSubMenuClick = function() {
            $('#page-sidebar-menu li a').click(function(e) {
                e.preventDefault();
                var url = this.href;
                if (url != null && url != 'javascript:;') {
                    $.get(url, function(data) {
                        $('#main-content').html(data);
                    });
                } 
                
            });
        };

        // ����������
        me.handleSubItemClick = function() {
            $('#page-sidebar-menu li ul li a').click(function(e) {
                
                var f = this;
                var pageTitle = document.getElementsByClassName("page-title")[0];
                pageTitle.innerHTML = f.innerHTML;
                
                $('#page-sidebar-menu li ul li a').each(function () {
                  if(this.className = this == f)
                  {
                    $(this.parentNode).addClass("active2");
                  }
                  else{
                    $(this.parentNode).removeClass("active2");
                  }
                });
                
                console.log();

                //��ȡ�����Ľڵ�
                var pul = document.getElementsByClassName("page-breadcrumb breadcrumb")[0];

                //��һ���˵�
                var ch1 = pul.childNodes[1];
                var ch1i1 = ch1.childNodes[1];
                var ch1a1 = ch1.childNodes[3];
                ch1i1.setAttribute("class","fa fa-cogs");
                ch1a1.innerHTML = f.parentNode.parentNode.parentNode.getElementsByClassName("title")[0].innerHTML;
                ch1a1.setAttribute("href","#");

                //�ڶ����˵�
                var ch2 = pul.childNodes[3];
                var ch2a1 = ch2.childNodes[1];
                ch2a1.innerHTML = f.innerHTML;
                ch2a1.setAttribute("href","rest/production_summery");
            });
        };

        me.init = function() {
            me.handleMenuClick();
            me.handleSubMenuClick();
            me.handleSubItemClick();
        };

        return me;
    })();

    Index.init();

    $('#btn-dashboard').trigger("click");
});