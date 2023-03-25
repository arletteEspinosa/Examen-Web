 $("#menu").click(function(){          if($("#ddmenu").hasClass("animationclas"))
          {            $("#ddmenu").removeClass("animationclas").addClass("removeanimation");
          }
          else
          {          $("#ddmenu").removeClass("removeanimation").addClass("animationclas");
          }
         });