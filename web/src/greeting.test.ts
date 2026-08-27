import { expect, test } from "bun:test";
import { greeting } from "./greeting";

test("builds a greeting", () => {
	expect(greeting("Dev Container")).toBe("Hello, Dev Container!");
});
