<?php
$main_frame = file_get_contents('http://localhost/view/main_frame.php');

$page = $_GET['q'] . '.php?';
$page .= http_build_query($_GET);

$content = file_get_contents(sprintf('http://localhost/view/%s', $page), false);
$content = explode('@@@@@@', $content);

echo sprintf($main_frame, $content[0], $content[1]);
