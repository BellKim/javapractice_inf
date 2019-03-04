//document해두된다.

$(function(){
	//클릭시 함수실행 ㄱㄱ/*로그인버튼 */
	$(".login_wrap>a").on("click",function(){
		$('#login_f').animate({top:"20px"},500);
		return false;
		/*	css에서 top에서 로그인을 위로 올려놨다. 내리는작업.*/ 
	}); ///////////////////////////////////////////////////
	
	/*로그인을 클릭하거나, close를 눌렀을때 다시 올려버림. */
	//login_wrap의 자식 login_close_btn 이거나 input을 온클릭(띠고 붙혔을때 차이알것)
	$(".login_wrap .login_close_btn, input[alt='로그인버튼']").on("click",function(){
		$('#login_f').animate({top:"-500px"},500);
		return false;
	});
	
	
	
	/*아이디나 비밀번호에서 focus를 받으면 이미지를 이동시킴. */
	$('#user_id, #user_pw').on("focus",function(){
		//$(this).prev().animate({left:"-3000px"});
		$(this).prev().css({left:"-3000px"});
	
	});
		/*포커스를 받으면 이미지를 없애고
		포커스를 잃으면 다시 가져온다.*/
	$('#user_id, #user_pw').on('blur', function() {
		if ($(this).val() == "")
			$(this).prev().css({
				"left" : "2px"
			});
	});/////////////////////
	
	/* 인쇄 버튼 */
	$(".print_btn").on("click", function() {
		window.print();
		return false;
	});///////////////////	
	
	//GNB 메뉴
	//GNB메뉴에 마우스를 올려놓으면(마우스오버포커스) 함수를 실행하라.
	var beforeEl;

	/*문-> 처음 페이지 오픈시 gnb메뉴중 회사소개가 나타나 있는상황을 연출하라. */
	/*처음 페이지 로드시 메뉴가 나타나도록 하는 구문. */
	$('#gnb>li:eq(1)>a>img').attr('src',
			$('#gnb>li:eq(1)>a>img').attr('src')
			.replace('out.gif','over.gif'));
	
	$('#gnb>li:eq(1)>a').next().stop().slideDown('normal');
	beforeEl=$('#gnb>li:eq(1)>a');
	//-------------------------------------------
	
	//마우스 오버를 해서 포커스가 들어가면 메뉴가 뜨게하기
	$("#gnb>li>a").on("mouseover focus", function(){
		if(beforeEl){
			$('img',beforeEl).attr('src',
					$('img',beforeEl).attr('src')
					.replace('over.gif','out.gif'));

	
			$(beforeEl).next().stop().slideUp('fast');
	
		}
		
		//이벤트가 발생한 a의 하위요소 img 에 src속성을 바꾼다.
		$('img',this).attr('src',
				$('img',this).attr('src')
				.replace('out.gif','over.gif'));
		
		$(this).next().stop().slideDown('normal');
		beforeEl=$(this);
	});
		
		/*//-------마우스를 올린상태에서 땠을때 메뉴 사라짐. 방법1. ----
		$(this).mouseleave(function(){
			if(beforeEl){
				$('img',beforeEl).attr('src',
						$('img',beforeEl).attr('src')
						.replace('over.gif','out.gif'));
				$(beforeEl).next().stop().slideUp('fast');
			}
		});//-------마우스를 올린상태에서 땠을때 메뉴 사라짐 끝. ----
*/		
		//-------마우스를 올린상태에서 땠을때 메뉴 사라짐. 방법2. ----
		$("#gnb").on('mouseleave',function(){
			$("#gnb ul:visible").slideUp("fast");
			if(beforeEl)
				beforeEl.children("img").attr("src",
						beforeEl.children("img").attr("src")
						.replace("over.gif", "out.gif"));
		});//-------마우스를 올린상태에서 땠을때 메뉴 사라짐 끝. ----
	
		/*전체메뉴*/ //css에는 displaynone으로 되어있어서 안보이는상태이다. 
		//즉 전체메뉴 버튼을 누르면 css로 display를 보이게 해주면 딘다는말이다. 
		$('#total_btn a').on('click',function(){
			$('#total_menu').slideDown('normal');
			$('img',this).attr('src',$('img',this).attr('src')
					     .replace('out.gif','over.gif'));
			return false;
		});////////////////////////////
		
		

		  /*전체 메뉴 닫기 버튼*/
		$('#total_close a').on('click',function(){
			$('#total_menu').slideUp('fast');
			$('#total_btn a img').attr('src',
					$('#total_btn a img').attr('src')
				    .replace('out.gif','over.gif'));		
		});//////////////////////////////
		
		/* 날짜 표기 */
		var t = new Date();
		var y = t.getFullYear();
		var m = t.getMonth();
		var d = t.getDate();

		$('#date_wrap .year').text(y);
		$('#date_wrap .month').text(m + 1);
		$('#date_wrap .date').text(d);
		////////////////////////////////////////////////
		
		/*관련 사이트 이동 (페이지 제일 하단 오른쪽)*/
		$('form[name=rel_f]').on('submit',function(){
			var url=$('select',this).val();
			//$(this).attr('action',url);
			//window.open(url);
			window.open(url,"","width:100px;height:100px;");
			return false;//새창에는 false까지 추가!
		});
		
		/*퀵메뉴*/
		//현재 기본적으로 가지고있는 위치값 가져오기 . 
		var defaultTop=parseInt($('#quick_menu').css("top"));
		
		$(document).on('scroll',function(){
			var scv=$(document).scrollTop();
			$('#quick_menu').stop()
			.animate({top:scv+defaultTop},1000);
		});
		
		//------------------------------------------------ 여기까지하고 
		//main.js로 이동.
		
		
		
		
		
		
		
		
		
		
		
		
		
	
});//end function();

 
















