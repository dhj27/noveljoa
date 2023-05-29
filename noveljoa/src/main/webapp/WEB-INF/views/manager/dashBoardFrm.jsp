<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.104.2">
<title></title>

<link rel="canonical" href="https://getbootstrap.com/docs/5.2/examples/dashboard/">

<link href="bootstrap.min.css" rel="stylesheet">

      <!-- jQuery CDN 시작 -->
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
     <!-- jQuery CDN 끝 -->
      <script type="text/javascript">
      $(function(){
    	 
    		 
    	 
    	  
    	  /* globals Chart:false, feather:false */
    	  (() => {
    	    'use strict'

    	    feather.replace({ 'aria-hidden': 'true' });

    
                var table = 
"<thead class='table-dark'>"+
"<tr><th scope='col'>총 회원 수</th>"+
"<th scope='col'>총 소설 수</th>"+
"<th scope='col'>당일 가입자 수</th>"+
"<th scope='col'>당일 방문자 수</th>"+
"<th scope='col'>당일 등록된 소설 수</th>"+
"<th scope='col'>당일 등록된 에피소드 수</th>"+
"</tr>"+
"</thead>"+
"<tbody>"+
"<tr>"+
"<td>"+${ dashData.memberCnt }+"</td>"+
"<td>"+${ dashData.novelCnt }+"</td>"+
"<td>"+${ dashData.todaySignUpCnt }+"</td>"+
"<td>"+${ dashData.todayVisitCnt }+"</td>"+
"<td>"+${ dashData.todayCreateNovelCnt }+"</td>"+
"<td>"+${ dashData.todayCreateEpCnt }+"</td>"+
"</tr>"+
"</tbody>";



$("#dTable").html(table);

let context = document
.getElementById('myChart');
let myChart =null;

// 오늘 날짜 객체 생성
var today = new Date();
var year = today.getFullYear().toString();
// 변수명을 각각 다르게 선언하여 날짜 저장
var date0 = today;
var date1 = new Date();
date1.setDate(today.getDate() - 1);
var date2 = new Date();
date2.setDate(today.getDate() - 2);
var date3 = new Date();
date3.setDate(today.getDate() - 3);
var date4 = new Date();
date4.setDate(today.getDate() - 4);
var date5 = new Date();
date5.setDate(today.getDate() - 5);
var date6 = new Date();
date6.setDate(today.getDate() - 6);

//날짜를 년-월-일 형식으로 변환하는 함수
function formatDate(date) {
  var month = (date.getMonth() + 1).toString().padStart(2, '0');
  var day = date.getDate().toString().padStart(2, '0');
  return month + '-' + day;
}

var formattedDate0 = formatDate(date0);
var formattedDate1 = formatDate(date1);
var formattedDate2 = formatDate(date2);
var formattedDate3 = formatDate(date3);
var formattedDate4 = formatDate(date4);
var formattedDate5 = formatDate(date5);
var formattedDate6 = formatDate(date6);


    	    
		    $("#totalMember").click(function(){
		    	if (myChart) {
		    	      myChart.destroy();
		    	      context.innerHTML = '';
		    	    }

	          myChart = new Chart(context, {
	                type: 'line', // 차트의 형태
	                data: { // 차트에 들어갈 데이터
	                    labels: [
	                        //x 축
	                    	formattedDate6,
	                    	formattedDate5,
	                    	formattedDate4,
	                    	formattedDate3,
	                    	formattedDate2,
	                    	formattedDate1,
	                    	formattedDate0
	                    ],
	                    datasets: [
	                        { //데이터
	                            label: '총 회원 수', //차트 제목
	                            fill: false, // line 형태일 때, 선 안쪽을 채우는지 안채우는지
	                            data: [
	                            	${ allMemCnt.allMCnt6 },
                                	${ allMemCnt.allMCnt5 },
                                	${ allMemCnt.allMCnt4 },
                                	${ allMemCnt.allMCnt3 },
                                	${ allMemCnt.allMCnt2 },
                                	${ allMemCnt.allMCnt1 },
                                	${ allMemCnt.allMCnt0 }  //x축 label에 대응되는 데이터 값
	                            ],
	                           /* 
	                           이쁜 색깔 목록
	                           'rgba(153, 102, 255, 0.2)'
	                           'rgba(255, 99, 132, 0.2)',
	                            'rgba(54, 162, 235, 0.2)',
	                            'rgba(255, 206, 86, 0.2)',
	                            'rgba(75, 192, 192, 0.2)', */
	                            lineTension: 0,
	                            backgroundColor:  'rgba(255, 99, 132, 0.2)',
	                            borderColor:  'rgba(255, 99, 132, 0.2)',
	                            borderWidth: 4, //경계선 굵기
	                            pointBackgroundColor:  'rgba(255, 99, 132, 0.2)',
	                        }
	              
	                    ]
	                },
	                options: {
	                    scales: {
	                        yAxes: [
	                            {
	                                ticks: {
	                                    beginAtZero: false
	                                }
	                            }
	                        ]
	                    }
	                },
	                legend: {
	                    display: false
	                  }
	             
	            });
    	    })//click
    	    
    	    $("#totalNovel").click(function(){
    	    	if (myChart) {
    	    	      myChart.destroy();
    	    	      context.innerHTML = '';
    	    	    }

    	    	 myChart = new Chart(context, {
                    type: 'line', // 차트의 형태
                    data: { // 차트에 들어갈 데이터
                        labels: [
                            //x 축
                        	formattedDate6,
	                    	formattedDate5,
	                    	formattedDate4,
	                    	formattedDate3,
	                    	formattedDate2,
	                    	formattedDate1,
	                    	formattedDate0
                        ],
                        datasets: [
                            { //데이터
                                label: '총 소설 수', //차트 제목
                                fill: false, // line 형태일 때, 선 안쪽을 채우는지 안채우는지
                                data: [
                                	${ allNovCnt.allNCnt6 },
                                	${ allNovCnt.allNCnt5 },
                                	${ allNovCnt.allNCnt4 },
                                	${ allNovCnt.allNCnt3 },
                                	${ allNovCnt.allNCnt2 },
                                	${ allNovCnt.allNCnt1 },
                                	${ allNovCnt.allNCnt0 } //x축 label에 대응되는 데이터 값
                                ],
                               /* 
                               이쁜 색깔 목록
                               'rgba(153, 102, 255, 0.2)',
                               'rgba(255, 99, 132, 0.2)',
                                'rgba(54, 162, 235, 0.2)',
                                'rgba(255, 206, 86, 0.2)',
                                'rgba(75, 192, 192, 0.2)', */
                                lineTension: 0,
                                backgroundColor:  'rgba(153, 102, 255, 0.2)',
                                borderColor:  'rgba(153, 102, 255, 0.2)',
                                borderWidth: 4, //경계선 굵기
                                pointBackgroundColor:  'rgba(153, 102, 255, 0.2)',
                            }
                  
                        ]
                    },
                    options: {
                        scales: {
                            yAxes: [
                                {
                                    ticks: {
                                        beginAtZero: false
                                    }
                                }
                            ]
                        }
                    },
                    legend: {
                        display: false
                      }
                    
                });
    	    })//click
    	    
    	    $("#join").click(function(){
    	    	if (myChart) {
    	    	      myChart.destroy();
    	    	      context.innerHTML = '';
    	    	    }

    	    	 myChart = new Chart(context, {
                    type: 'line', // 차트의 형태
                    data: { // 차트에 들어갈 데이터
                        labels: [
                            //x 축
                        	formattedDate6,
	                    	formattedDate5,
	                    	formattedDate4,
	                    	formattedDate3,
	                    	formattedDate2,
	                    	formattedDate1,
	                    	formattedDate0
                        ],
                        datasets: [
                            { //데이터
                                label: '가입자 수', //차트 제목
                                fill: false, // line 형태일 때, 선 안쪽을 채우는지 안채우는지
                                data: [
                                	${ joinCnt.jCnt6 },
                                	${ joinCnt.jCnt5 },
                                	${ joinCnt.jCnt4 },
                                	${ joinCnt.jCnt3 },
                                	${ joinCnt.jCnt2 },
                                	${ joinCnt.jCnt1 },
                                	${ joinCnt.jCnt0 }  //x축 label에 대응되는 데이터 값
                                ],
                               /* 
                               이쁜 색깔 목록
                               'rgba(153, 102, 255, 0.2)'
                               'rgba(255, 99, 132, 0.2)',
                                'rgba(54, 162, 235, 0.2)',
                                'rgba(255, 206, 86, 0.2)',
                                'rgba(75, 192, 192, 0.2)', */
                                lineTension: 0,
                                backgroundColor:   'rgba(54, 162, 235, 0.2)',
                                borderColor:   'rgba(54, 162, 235, 0.2)',
                                borderWidth: 4, //경계선 굵기
                                pointBackgroundColor:   'rgba(54, 162, 235, 0.2)',
                            }
                  
                        ]
                    },
                    options: {
                        scales: {
                            yAxes: [
                                {
                                    ticks: {
                                        beginAtZero: false
                                    }
                                }
                            ]
                        }
                    },
                    legend: {
                        display: false
                      }
                    
                });
        	    });//click
    	    
  			$("#visit").click(function(){
  				if (myChart) {
  			      myChart.destroy();
  			      context.innerHTML = '';
  			    }

  				 myChart = new Chart(context, {
  	                type: 'line', // 차트의 형태
  	                data: { // 차트에 들어갈 데이터
  	                    labels: [
  	                        //x 축
  	                    	formattedDate6,
	                    	formattedDate5,
	                    	formattedDate4,
	                    	formattedDate3,
	                    	formattedDate2,
	                    	formattedDate1,
	                    	formattedDate0
  	                    ],
  	                    datasets: [
  	                        { //데이터
  	                            label: '방문자 수', //차트 제목
  	                            fill: false, // line 형태일 때, 선 안쪽을 채우는지 안채우는지
  	                            data: [
  	                            	${ visitCnt.vCnt6 },
                                	${ visitCnt.vCnt5 },
                                	${ visitCnt.vCnt4 },
                                	${ visitCnt.vCnt3 },
                                	${ visitCnt.vCnt2 },
                                	${ visitCnt.vCnt1 },
                                	${ visitCnt.vCnt0 }  //x축 label에 대응되는 데이터 값
  	                            ],
  	                           /* 
  	                           이쁜 색깔 목록
  	                           'rgba(153, 102, 255, 0.2)'
  	                           'rgba(255, 99, 132, 0.2)',
  	                            'rgba(54, 162, 235, 0.2)',
  	                            'rgba(255, 206, 86, 0.2)',
  	                            'rgba(75, 192, 192, 0.2)', */
  	                            lineTension: 0,
  	                            backgroundColor:   'rgba(75, 192, 192, 0.2)',
  	                            borderColor:   'rgba(75, 192, 192, 0.2)',
  	                            borderWidth: 4, //경계선 굵기
  	                            pointBackgroundColor:   'rgba(75, 192, 192, 0.2)',
  	                        }
  	              
  	                    ]
  	                },
  	                options: {
  	                    scales: {
  	                        yAxes: [
  	                            {
  	                                ticks: {
  	                                    beginAtZero: false
  	                                }
  	                            }
  	                        ]
  	                    }
  	                },
  	                legend: {
  	                    display: false
  	                  }
  	                
  	            });
    	    })//click
    	    
    	    
    	    
    	
    	    
    	  })()
            
    	  });
      </script>
      
      <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }

      .b-example-divider {
        height: 3rem;
        background-color: rgba(0, 0, 0, .1);
        border: solid rgba(0, 0, 0, .15);
        border-width: 1px 0;
        box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);
      }

      .b-example-vr {
        flex-shrink: 0;
        width: 1.5rem;
        height: 100vh;
      }

      .bi {
        vertical-align: -.125em;
        fill: currentColor;
      }

      .nav-scroller {
        position: relative;
        z-index: 2;
        height: 2.75rem;
        overflow-y: hidden;
      }

      .nav-scroller .nav {
        display: flex;
        flex-wrap: nowrap;
        padding-bottom: 1rem;
        margin-top: -1px;
        overflow-x: auto;
        text-align: center;
        white-space: nowrap;
        -webkit-overflow-scrolling: touch;
      }
    </style>
    
    <!-- Custom styles for this template -->
    <link href="dashboard.css" rel="stylesheet">
    
</head>
<body>
<header class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow">
  <a class="navbar-brand col-md-3 col-lg-2 me-0 px-3 fs-6" href="dashBoardFrm.do">소설조아</a>
  <button class="navbar-toggler position-absolute d-md-none collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#sidebarMenu" aria-controls="sidebarMenu" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="navbar-nav">
    <div class="nav-item text-nowrap">
      <a class="nav-link px-3" href="managerLogout.do">Sign out</a>
    </div>
  </div>
</header>

<div class="container-fluid">
  <div class="row">
    <nav id="sidebarMenu" class="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse">
      <div class="position-sticky pt-3 sidebar-sticky">
        <ul class="nav flex-column">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="dashBoardFrm.do">
              <span data-feather="home" class="align-text-bottom"></span>
              Dashboard
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="memberManagerFrm.do">
              <span data-feather="users" class="align-text-bottom"></span>
             Member
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="managerNovelFrm.do">
              <span data-feather="book-open" class="align-text-bottom"></span>
              Novel
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="messageQNABoardFrm.do">
              <span data-feather="clipboard" class="align-text-bottom"></span>
              Q&A Board
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="commentManagerFrm.do">
              <span data-feather="message-square" class="align-text-bottom"></span>
              Comment
            </a>
          </li>
        </ul>

     
      </div>
    </nav>

    <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4">
      <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pt-3 pb-2 mb-3 border-bottom">
        <h1 class="h2">Dashboard</h1>
        <div class="btn-toolbar mb-2 mb-md-0">

          <div class="btn-group">
    <button type="button" class="btn btn-sm btn-outline-secondary dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
            <span class="align-text-bottom"></span>
            그래프 선택
          </button>
  <ul class="dropdown-menu">
    <li><a class="dropdown-item" href="#" id="totalMember">총 회원 수</a></li>
       <li><hr class="dropdown-divider" ></li>
    <li><a class="dropdown-item" href="#" id="totalNovel">총 소설 수</a></li>
       <li><hr class="dropdown-divider"></li>
    <li><a class="dropdown-item" href="#" id="join">가입자 수</a></li>
    <li><hr class="dropdown-divider"></li>
    <li><a class="dropdown-item" href="#" id="visit">방문자 수</a></li>
  </ul>
</div>
   
        </div>
      </div>
      
      <div class="table-responsive">
        <table class="table table-hover table-sm" id="dTable">
           
        </table>
      </div>

      <canvas class="my-4 w-100" id="myChart" width="900" height="380"></canvas>
      
      

      
    </main>
  </div>
</div>


    <script src="bootstrap.bundle.min.js"></script>

      <script src="https://cdn.jsdelivr.net/npm/feather-icons@4.28.0/dist/feather.min.js" integrity="sha384-uO3SXW5IuS1ZpFPKugNNWqTZRRglnUJK6UAZ/gxOX80nxEkN9NcGZTftn6RzhGWE" crossorigin="anonymous"></script>
      <script src="https://cdn.jsdelivr.net/npm/chart.js@2.9.4/dist/Chart.min.js" integrity="sha384-zNy6FEbO50N+Cg5wap8IKA4M/ZnLJgzc6w2NqACZaK0u0FXfOWRRJOnQtpZun8ha" crossorigin="anonymous"></script>

</body>
</html>