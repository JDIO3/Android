<?php
    if (isset($_POST['farmerId']) && isset($_POST['dob'])) {
        require_once "conn.php";
        require_once "validate.php";
        $farmerId = validate($_POST['farmerId']);
        $dob = validate($_POST['dob']);
        $sql = "select * from personal_information where farmer_Id='$farmerId' and dob='" . md5($password) . "' ";
        $result = $conn->query($sql);
        if ($result->num_rows > 0) {
            echo "success";
        }
        else {
            echo "failure"; 
        }
    }
?>