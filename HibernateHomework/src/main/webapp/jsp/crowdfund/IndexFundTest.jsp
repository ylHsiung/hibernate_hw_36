<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>募資首頁</title>
    <!-- Bootstrap 5 CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <h2 class="text-center mb-4">募資活動管理</h2>

    <!-- 查詢活動名稱 -->
    <form action="<%= request.getContextPath() %>/CrowdFundSearchByCamName" method="get" class="mb-3">
        <div class="input-group">
            <input type="text" class="form-control" name="campaign_name" placeholder="輸入活動名稱">
            <button class="btn btn-primary" type="submit">查詢</button>
        </div>
    </form>

    <!-- 依活動類別查詢 -->
    <form action="<%= request.getContextPath() %>/CrowdFundSearchByCamCategory" method="get" class="mb-3">
        <div class="input-group">
         <span class="input-group-text">類別</span>
            <select name="campaign_category" class="form-select">
                <option value="手作">手作</option>
                <option value="音樂">音樂</option>
                <option value="科技">科技</option>
                <option value="環境">環境</option>
                <option value="教育">教育</option>
                <option value="其他">其他</option>
            </select>
            <button class="btn btn-secondary" type="submit">查詢</button>
        </div>
    </form>
    <!-- 依活動狀態查詢 -->
    <form action="<%= request.getContextPath() %>/CrowdFundSearchByCamStatus" method="get" class="mb-3">
        <div class="input-group">
         <span class="input-group-text">狀態</span>
        <select name="status" class="form-select">
  			<option value="草稿">草稿</option>
 			<option value="進行中">進行中</option>
  			<option value="成功">成功</option>
 			<option value="已結束">已結束</option>
  			
		</select>
		<button class="btn btn-secondary" type="submit">查詢</button>
        </div>
        </form>

    <!-- 查詢全部、新增活動 -->
    <div class="d-flex justify-content-center gap-3 mt-4">
        <form action="<%= request.getContextPath() %>/CrowdFundGetAllCams">
            <button class="btn btn-success" type="submit">查詢全部活動</button>
        </form>

        <form action="<%= request.getContextPath() %>/html/feature/crowdfund/InsertCam.html">
            <button class="btn btn-outline-primary" type="submit">新增活動</button>
        </form>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
