
console.log(`Process PID: ${process.pid}`);  
console.log(`Uptime: ${process.uptime()}`);
console.log(`Memory Usage: ${process.memoryUsage()}`);
console.log(`Kill a process :  ${process.kill(process.pid)}`);