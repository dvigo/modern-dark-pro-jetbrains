# Contributing to Modern Dark Pro for JetBrains

Thank you for your interest in contributing to Modern Dark Pro! We welcome contributions from the community.

## How to Contribute

### Reporting Bugs

If you find a bug in the theme:

1. **Check existing issues** - Look through [GitHub Issues](https://github.com/dvigo/modern-dark-pro-jetbrains/issues) to see if the bug has already been reported
2. **Create a new issue** - If it hasn't been reported, create a new issue with:
   - Clear description of the bug
   - Steps to reproduce
   - IDE version and platform (Windows/Mac/Linux)
   - Screenshots if applicable

### Suggesting Enhancements

Have an idea for an improvement?

1. Check the [issues page](https://github.com/dvigo/modern-dark-pro-jetbrains/issues) for similar suggestions
2. Open a new issue describing:
   - The enhancement you'd like
   - Why you think it would be helpful
   - How it might be implemented

### Submitting Changes

Ready to code? Here's how to submit your changes:

1. **Fork the repository**
   ```bash
   git clone https://github.com/your-username/modern-dark-pro-jetbrains.git
   ```

2. **Create a feature branch**
   ```bash
   git checkout -b feature/your-feature-name
   ```

3. **Make your changes**
   - Update the color schemes in `colors/` directory
   - Test in your JetBrains IDE
   - Update documentation as needed

4. **Commit your changes**
   ```bash
   git commit -m "Add description of changes"
   ```

5. **Push to your fork**
   ```bash
   git push origin feature/your-feature-name
   ```

6. **Open a Pull Request**
   - Describe what you've changed
   - Reference any related issues
   - Wait for review and feedback

## Development Guidelines

### Color Scheme Development

- Test your changes in multiple JetBrains IDEs
- Ensure colors meet WCAG AA contrast standards
- Verify syntax highlighting works for multiple languages
- Test on different platforms (Windows, Mac, Linux)

### XML Format

The theme files are in JetBrains XML format. Key elements:

- `<scheme>` - Root element defining the color scheme
- `<colors>` - Global IDE colors
- `<attributes>` - Editor and UI element colors

### Testing

1. Place your XML files in:
   - macOS: `~/Library/Application Support/JetBrains/{IDE}/colors/`
   - Linux: `~/.config/JetBrains/{IDE}/colors/`
   - Windows: `%APPDATA%\JetBrains\{IDE}\colors\`

2. Restart your IDE
3. Go to Settings/Preferences → Appearance → Theme
4. Select your theme and verify colors look correct

## Code of Conduct

- Be respectful and constructive
- Provide helpful feedback
- Welcome all contributors
- Keep discussions focused and relevant

## Questions?

If you have any questions:

1. Check the [README](README.md) and [DEVELOPMENT.md](DEVELOPMENT.md)
2. Open a [discussion](https://github.com/dvigo/modern-dark-pro-jetbrains/discussions)
3. Create an issue with your question

## License

By contributing to Modern Dark Pro, you agree that your contributions will be licensed under the MIT License.

---

Thank you for contributing to Modern Dark Pro! 🎨✨
