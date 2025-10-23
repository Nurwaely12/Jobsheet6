<?php
// --- KONFIGURASI KONEKSI POSTGRESQL ---
$host   = 'localhost';
$port   = '5432';
$dbname = 'php_brownies';
$user   = 'postgres';
$pass   = 'waely1234';

// Membuat koneksi 
$conn = pg_connect("host=$host port=$port dbname=$dbname user=$user password='$pass'");
if (!$conn) {
    die('Koneksi gagal: ' . pg_last_error());
} 

// Set encoding
pg_set_client_encoding($conn, 'UTF8');

// Query yang bersih dengan alias tanpa spasi
$sql = 'SELECT
            "Id_Brownies",
            "Nama Brownies" AS "Nama",
            "Deskripsi " AS "Deskripsi",
            "Harga"
        FROM "LittleBites"
        ORDER BY "Id_Brownies"';

$result = pg_query($conn, $sql);
if (!$result) {
    die('Query gagal: ' . pg_last_error($conn));
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Daftar Menu Brownies</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f9f9f9;
        margin: 0;
        padding: 20px;
        color: #333;
    }

    h1 {
        text-align: center;
        color: #5a2e0f;
    }

    table {
        width: 80%;
        margin: 20px auto;
        border-collapse: collapse;
        background-color: #fff;
    }

    th, td {
        border: 1px solid #ccc;
        padding: 10px;
        text-align: center;
    }

    th {
        background-color: #8b4513;
        color: white;
    }

    th:last-child, td:last-child {
        width: 130px;
    }
</style>
</head>
<body>
    <h1>Daftar Menu Brownies</h1>
    <table border="1" cellpadding="10" cellspacing="0">
        <tr>
            <th>No</th>
            <th>ID Brownies</th>
            <th>Nama</th>
            <th>Deskripsi</th>
            <th>Harga</th>
        </tr>

        <?php $i = 1; ?>
        <?php while ($row = pg_fetch_assoc($result)): ?>
        <tr>
            <td><?= $i; ?></td>
            <td><?= htmlspecialchars($row["Id_Brownies"], ENT_QUOTES, 'UTF-8'); ?></td>
            <td><?= htmlspecialchars($row["Nama"], ENT_QUOTES, 'UTF-8'); ?></td>
            <td><?= htmlspecialchars($row["Deskripsi"], ENT_QUOTES, 'UTF-8'); ?></td>
            <td>Rp <?= number_format($row["Harga"], 0, ',', '.'); ?></td>
        </tr>
        <?php $i++; endwhile; ?>
    </table>
</body>
</html>

<?php
pg_free_result($result);
pg_close($conn); 
?>
