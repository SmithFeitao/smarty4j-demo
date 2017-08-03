<html>
<body>
<h2>Hello World!</h2>
<ul>
hahah
{foreach from=$userList item=user}
	<li>{$user.id}</li>
    <li>{$user.name}</li>
{/foreach}
</ul>
</body>
</html>
