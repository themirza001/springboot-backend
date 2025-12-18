resource "aws_cloudwatch_log_group" "ecs" {
  name              = "/ecs/springboot-backend"
  retention_in_days = 7
}

