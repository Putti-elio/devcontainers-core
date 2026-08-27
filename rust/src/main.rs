fn greeting(name: &str) -> String {
    format!("Hello, {name}!")
}

fn main() {
    println!("{}", greeting("Dev Container"));
}

#[cfg(test)]
mod tests {
    use super::greeting;

    #[test]
    fn builds_a_greeting() {
        assert_eq!(greeting("Dev Container"), "Hello, Dev Container!");
    }
}
